package org.kesler.common;

public class BranchDTO {
    private Long id;
	private String code;
    private String name;
    private String pvdIp;
    private String pvdUser;
    private String pvdPassword;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPvdIp() { return pvdIp; }
    public void setPvdIp(String pvdIp) { this.pvdIp = pvdIp; }

    public String getPvdUser() { return pvdUser; }
    public void setPvdUser(String pvdUser) { this.pvdUser = pvdUser; }

    public String getPvdPassword() { return pvdPassword; }
    public void setPvdPassword(String pvdPassword) { this.pvdPassword = pvdPassword; }

}
