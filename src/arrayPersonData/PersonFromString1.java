package arrayPersonData;

//import arrayPersonData.PersonFromString.Lytis;

public class PersonFromString1 {
	public class Person {
		private String id;
		private String vardas;
		private String pavarde;
		private String ak;
		private Integer gimMetai;
		private Lytis lytis;

		// setters & getters below...
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getVardas() {
			return vardas;
		}

		public void setVardas(String vardas) {
			this.vardas = vardas;
		}

		public String getPavarde() {
			return pavarde;
		}

		public void setPavarde(String pavarde) {
			this.pavarde = pavarde;
		}

		public String getAk() {
			return ak;
		}

		public void setAk(String ak) {
			this.ak = ak;
		}

		public Integer getGimMetai() {
			return gimMetai;
		}

		public void setGimMetai(Integer gimMetai) {
			this.gimMetai = gimMetai;
		}

		public Lytis getLytis() {
			return lytis;
		}

		public void setLytis(Lytis lytis) {
			this.lytis = lytis;
		}

		Integer gimMetai1 = Integer.parseInt("gimMetai");

	}

	public enum Lytis {
		VYR, MOT, KITA

	}

}
