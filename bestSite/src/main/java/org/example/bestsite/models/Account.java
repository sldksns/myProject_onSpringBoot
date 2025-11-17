package org.example.bestsite.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Account {
    @Column(name = "u_name")
    private String name;
    @Column(name = "u_lname")
    private String lastname;
    @Column(name = "u_desc")
    private String description;
    @Column(
            name = "u_email",
            unique = true
    )
    private String email;
    @Column(name = "u_pnumber")
    private String phonenumber;
    @Id
    @GeneratedValue
    private Integer ID;

    public Account(String name, String lastname, String description, String email, String phonenumber) {
        this.name = name;
        this.lastname = lastname;
        this.description = description;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public Account() {
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Account)) return false;
        final Account other = (Account) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$lastname = this.getLastname();
        final Object other$lastname = other.getLastname();
        if (this$lastname == null ? other$lastname != null : !this$lastname.equals(other$lastname)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$phonenumber = this.getPhonenumber();
        final Object other$phonenumber = other.getPhonenumber();
        if (this$phonenumber == null ? other$phonenumber != null : !this$phonenumber.equals(other$phonenumber))
            return false;
        final Object this$ID = this.getID();
        final Object other$ID = other.getID();
        if (this$ID == null ? other$ID != null : !this$ID.equals(other$ID)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Account;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $lastname = this.getLastname();
        result = result * PRIME + ($lastname == null ? 43 : $lastname.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $phonenumber = this.getPhonenumber();
        result = result * PRIME + ($phonenumber == null ? 43 : $phonenumber.hashCode());
        final Object $ID = this.getID();
        result = result * PRIME + ($ID == null ? 43 : $ID.hashCode());
        return result;
    }

    public String toString() {
        return "Account(name=" + this.getName() + ", lastname=" + this.getLastname() + ", description=" + this.getDescription() + ", email=" + this.getEmail() + ", phonenumber=" + this.getPhonenumber() + ", ID=" + this.getID() + ")";
    }
}
