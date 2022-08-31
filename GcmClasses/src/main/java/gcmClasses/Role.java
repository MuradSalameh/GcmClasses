package gcmClasses;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;



@XmlRootElement

public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String roleName;
	private String roleDescription;

	public Role() {
		super();
	}

	public Role(String roleName, String roleDescription) {
		super();

		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	@XmlElement(name = "ID", required = true)
	public int getId() {
		return id;
	}

	@XmlElement(name = "RoleName")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@XmlElement(name = "RoleDescription")
	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nRole id=" + id + "\nroleName=" + roleName + "\nroleDescription=" + roleDescription
				+ "\n----------------------------------" + "\n";
	}

}