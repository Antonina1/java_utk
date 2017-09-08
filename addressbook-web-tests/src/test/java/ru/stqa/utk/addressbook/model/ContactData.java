package ru.stqa.utk.addressbook.model;

public class ContactData {
    private final String userfirstname;
    private final String userlastname;
    private final String nickname;
    private final String useraddress;
    private final String usermobile;

    public ContactData(String userfirstname, String userlastname, String nickname, String useraddress, String usermobile) {
        this.userfirstname = userfirstname;
        this.userlastname = userlastname;
        this.nickname = nickname;
        this.useraddress = useraddress;
        this.usermobile = usermobile;
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
}
