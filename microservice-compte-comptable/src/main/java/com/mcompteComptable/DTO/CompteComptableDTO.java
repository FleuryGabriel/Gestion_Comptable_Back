package com.mcompteComptable.DTO;

import com.mcompteComptable.entities.Devise;

public class CompteComptableDTO {
		private Long id;
		private String code;
		private String nom;
		private String sens;
		private boolean deleted=false;
		private Devise devise;
		
		public CompteComptableDTO() {
		}

		public CompteComptableDTO(Long id, String code, String nom, String sens, boolean deleted, Devise devise) {
			this.id = id;
			this.code = code;
			this.nom = nom;
			this.sens = sens;
			this.deleted = deleted;
			this.devise = devise;
		}

		public CompteComptableDTO(String code, String nom, String sens, boolean deleted, Devise devise) {
			this.code = code;
			this.nom = nom;
			this.sens = sens;
			this.deleted = deleted;
			this.devise = devise;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getSens() {
			return sens;
		}
		public void setSens(String sens) {
			this.sens = sens;
		}
		public boolean isDeleted() {
			return deleted;
		}
		
		public Devise getDevise() {
			return devise;
		}

		public void setDevise(Devise devise) {
			this.devise = devise;
		}

		public void setDeleted(boolean deleted) {
			this.deleted = deleted;
		}
		
}
