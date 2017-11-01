package ru.stqa.utk.addressbook.model;

public class ContactData {
    private final String userfirstname;
    private final String userlastname;
    private final String nickname;
    private final String useraddress;
    private final String usermobile;
    private String group;

    public ContactData(String userfirstname, String userlastname, String nickname, String useraddress, String usermobile, String group) {
        this.userfirstname = userfirstname;
        this.userlastname = userlastname;
        this.nickname = nickname;
        this.useraddress = useraddress;
        this.usermobile = usermobile;
        this.group = group;
    }

    public String getUserfirstname() {
        return userfirstname;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public String getUsermobile() {
        return usermobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        return userfirstname != null ? userfirstname.equals(that.userfirstname) : that.userfirstname == null;
    }

    @Override
    public int hashCode() {
        return userfirstname != null ? userfirstname.hashCode() : 0;
    }

    @Override

    public String toString() {
        return "ContactData{" +
                "userfirstname='" + userfirstname + '\'' +
                '}';
    }

    public String getGroup() {
        return group;
    }
}


