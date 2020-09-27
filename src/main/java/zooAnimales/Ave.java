package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Ave extends Animal {
		private static List<Ave> listado = new ArrayList<Ave>();
		static int halcones;
		static int aguilas;
		String colorPlumas;
		public Ave(String nomb,int edd, String habit, String gene, String colo){
			super(nomb,edd,habit,gene);
			colorPlumas = colo;
			listado.add(this);
		}
		public Ave(){
			listado.add(this);
		}
		public static int cantidadAves() {
			return listado.size();
		}
		public String movimiento() {
			return "volar";
		}
		public static Ave crearHalcon(String nomb, int edd, String gene) {
			halcones ++;
			return new Ave(nomb, edd, "montañas", gene, "cafe glorioso");
		}
		public static Ave crearAguila(String nomb, int edd, String gene) {
			aguilas ++;
			return new Ave(nomb, edd, "montanas", gene, "blanco y amarillo");
		}
		public static List<Ave> getListado() {
			return listado;
		}
		public static void setListado(List<Ave> listado) {
			Ave.listado = listado;
		}
		public String getColorPlumas() {
			return colorPlumas;
		}
		public void setColorPlumas(String colorPlumas) {
			this.colorPlumas = colorPlumas;
		}
	
}