package com.sudo.sandwich.web.controller;

import com.sudo.sandwich.json.domain.Incident;
import com.sudo.sandwich.json.domain.User;
import com.sudo.sandwich.services.*;
import com.sudo.sandwich.web.vo.IncidentVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.Collection;

/**
 * User
 * Created by Zuber on 12/21/15.
 */
@RestController
public class IncidentController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Inject
    IncidentService incidentService;

    @Inject
    UserService userService;

    @RequestMapping("/sudo/incidents/{userId}")
    public
    @ResponseBody
    IncidentVO getIncidents(@PathVariable("userId") String userId) {
        Collection<Incident> incidents = incidentService.getIncidentsByUser(userId);
        return create(incidents);
    }

    private IncidentVO create(Collection<Incident> incidents) {
        IncidentVO incidentVO = new IncidentVO();
        incidentVO.noOfIssues = incidents.size();
        incidentVO.setIncidents(incidents);
        incidents.stream().forEach(incident -> {
            IncidentStatus status = IncidentUtil.getStatus(incident);
            switch (status) {
                case OPEN:
                    incidentVO.openIssues++;
                    break;
            }
        });
        return incidentVO;
    }

}
