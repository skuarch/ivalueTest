package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author skuarch
 */
@Entity
@Table(name = "USER_POLICY_DETAILS")
public class UserPolicyDetails {

    @Id
    @Column(name = "USER_POLICY_DETAILS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private Users user;

    @OneToOne
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private Policy policy;

    @OneToOne
    @JoinColumn(name = "POLICY_STATUS_ID", nullable = false)
    private PolicyStatus policyStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    @Override
    public String toString() {
        return "id: " + id + " user:" + user + " policy:" + policy + " policyStatus:" + policyStatus;
    }

}
