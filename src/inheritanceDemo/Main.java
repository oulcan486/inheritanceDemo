package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		IhtiyacKrediManager ihtiyacKrediManager=new IhtiyacKrediManager();
		TarimKrediManager tarimKrediManager=new TarimKrediManager();
		AskerKrediManager askerKrediManager=new AskerKrediManager();
		
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(askerKrediManager);

	}

}
