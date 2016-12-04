package model.service;

import entities.Users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author skuarch
 */
@Service
public class UnreadReportService {

    private static final String SQL = "select u.user_id, u.name, upd.user_policy_details_id "
            + "from user_policy_details as upd "
            + "full join users as u "
            + "on u.user_id = upd.user_id "
            + "where user_policy_details_id is null";

    @Autowired
    private SessionFactory sessionFactory;

    //==========================================================================
    public List<Users> getUsers() {
        
        Session session = sessionFactory.getCurrentSession();
        SQLQuery sqlq = session.createSQLQuery(SQL);
        sqlq.addEntity("user_policy_details", Users.class);
        List<Users> list = new ArrayList(sqlq.list());

        return list;

    }

}
