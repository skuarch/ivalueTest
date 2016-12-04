package controller;

import javax.transaction.Transactional;
import model.service.UnreadReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author skuarch
 */
@RestController
@Transactional
public class UnreadReport {

    @Autowired
    private UnreadReportService urs;

    //==========================================================================
    @ResponseBody
    @GetMapping("/report/unread")
    public Object reportUnread() {

        return urs.getUsers();

    }

}
