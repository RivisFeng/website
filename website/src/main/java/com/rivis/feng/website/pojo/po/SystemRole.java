package com.rivis.feng.website.pojo.po;

public class SystemRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_role.role_id
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_role.role_name
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_role.role_description
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    private String roleDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_role.role_id
     *
     * @return the value of system_role.role_id
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_role.role_id
     *
     * @param roleId the value for system_role.role_id
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_role.role_name
     *
     * @return the value of system_role.role_name
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_role.role_name
     *
     * @param roleName the value for system_role.role_name
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_role.role_description
     *
     * @return the value of system_role.role_description
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_role.role_description
     *
     * @param roleDescription the value for system_role.role_description
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }
}