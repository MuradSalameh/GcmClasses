package gcmClasses;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Role  implements Serializable{
	
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

	public int getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
	

}