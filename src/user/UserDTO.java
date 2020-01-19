package user;

import java.sql.Timestamp;

public class UserDTO {
    private int id;
    private String name;
    private String password;
    private String flavor;
    private Boolean delete_flag;
    private Timestamp upload;
    private Timestamp modify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Boolean getDeleteFlag() {
        return delete_flag;
    }

    public void setDeleteFlag(Boolean delete_flag) {
        this.delete_flag = delete_flag;
    }

    public Timestamp getUpload() {
        return upload;
    }

    public void setUpload(Timestamp upload) {
        this.upload = upload;
    }

    public Timestamp getModify() {
        return modify;
    }

    public void setModify(Timestamp modify) {
        this.modify = modify;
    }
}
