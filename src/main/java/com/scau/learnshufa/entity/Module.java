package com.scau.learnshufa.entity;

import java.io.Serializable;

public class Module implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_module.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_module.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_module.attributes
     *
     * @mbg.generated
     */
    private String attributes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sf_module.backup
     *
     * @mbg.generated
     */
    private String backup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sf_module
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_module.ID
     *
     * @return the value of sf_module.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_module.ID
     *
     * @param id the value for sf_module.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_module.name
     *
     * @return the value of sf_module.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_module.name
     *
     * @param name the value for sf_module.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_module.attributes
     *
     * @return the value of sf_module.attributes
     *
     * @mbg.generated
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_module.attributes
     *
     * @param attributes the value for sf_module.attributes
     *
     * @mbg.generated
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sf_module.backup
     *
     * @return the value of sf_module.backup
     *
     * @mbg.generated
     */
    public String getBackup() {
        return backup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sf_module.backup
     *
     * @param backup the value for sf_module.backup
     *
     * @mbg.generated
     */
    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_module
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributes=").append(attributes);
        sb.append(", backup=").append(backup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_module
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Module other = (Module) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAttributes() == null ? other.getAttributes() == null : this.getAttributes().equals(other.getAttributes()))
            && (this.getBackup() == null ? other.getBackup() == null : this.getBackup().equals(other.getBackup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_module
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        result = prime * result + ((getBackup() == null) ? 0 : getBackup().hashCode());
        return result;
    }
}