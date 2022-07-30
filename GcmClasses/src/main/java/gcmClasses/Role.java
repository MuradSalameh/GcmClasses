package gcmClasses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Role {	
	
	private int id;	
	private String roleName;	
	private String roleDescription;	
    
	public Role() {
		super();
	}

	public Role(int id, String roleName, String roleDescription) {
		super();
		this.id = id;
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

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}