package controller;

import daos.UserPolicyDetailsDao;
import entities.UserPolicyDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author skuarch
 */
@RestController
public class ReadPolicies {

    @Autowired
    private UserPolicyDetailsDao userPolicyDetailsDao;

    @ResponseBody
    @RequestMapping(name = "/create/detail/policy", method = RequestMethod.POST)
    public Object index(@ModelAttribute UserPolicyDetails userPolicyDetails) {
        
        Object object = userPolicyDetailsDao.save(userPolicyDetails); 
        return object.toString();

    }

}
