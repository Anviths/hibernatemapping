package edu.ty.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	 private Long id;
	    private String name;
	    private String version;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		@Override
		public String toString() {
			return "Application [id=" + id + ", name=" + name + ", version=" + version + "]";
		}
	    

}
