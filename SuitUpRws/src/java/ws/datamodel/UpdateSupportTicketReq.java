package ws.datamodel;

import entity.SupportTicketEntity;

/**
 *
 * @author lyntan
 */
public class UpdateSupportTicketReq {
    
    private String email;
    private String password;
    private SupportTicketEntity supportTicket;
    
    public UpdateSupportTicketReq(String email, String password, SupportTicketEntity supportTicket) {
        this.email = email;
        this.password = password;
        this.supportTicket = supportTicket;
    }

    public UpdateSupportTicketReq() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SupportTicketEntity getSupportTicketEntity() {
        return supportTicket;
    }

    public void setSupportTicket(SupportTicketEntity supportTicket) {
        this.supportTicket = supportTicket;
    }
    
    
    
}
