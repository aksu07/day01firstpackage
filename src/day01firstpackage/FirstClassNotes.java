package day01firstpackage;

public class FirstClassNotes {

	public static void main(String[] args) {
		
		/*
		
		hangi versionu gondermek istiyorsam onu commit ediyorum ve
			kodumu geri remote gondeririyorum
				
				Command Prompt baslica komutlar(basic commands)
					pwd => Print Working directory => hali hazirdaki adresi goster
					ls => listele her hangi bir dosyanin icerigini listele
					cd =>change directory => konum degistir
					cd .. => bir hamle geri goturuyor
				
				********Butun adimlar:**********
		--> cd + project path => properties tum adresi aldim
		--> git init => ve localda projemin icine git repository olusturduk
			  eclipse ten alip codlarimizi staging area ya tasiyoruz
		--> git add src/firstpackage/FirstClass.java
		
		Ne zaman durumu yoklamak isterseniz bu komutu kullanabilirsiniz
			git status
		
		git add . => tum file ve folder lari staging area ya ekle demektir
		git commit -m "first commit from local repo" artik staging area dan local repository e aktarmis oluyoruz
		
		C:\Users\sam\eclipse-workspace\git_proje_turkce>git commit -m "first commit from local repo"
		[master (root-commit) e23d4ec] first commit from local repo
		 5 files changed, 49 insertions(+)
		 create mode 100644 .classpath
		 create mode 100644 .project
		 create mode 100644 .settings/org.eclipse.jdt.core.prefs
		 create mode 100644 bin/firstpackage/FirstClass.class
		 create mode 100644 src/firstpackage/FirstClass.java
		 
		git remote add origin https://github.com/HalilIbrahimHasan/git_proje_turkce.git 
			tek seferlik remote repositoryi belirlemek icin bu command (komutu) kullaniyoruz.
			
		 Son olarak:
		git push -u origin master => ilk ve son kez bu komutu kullaniyoruz
		 
		Eclipse'imden statging area icin hangi command i kullanmam gerekiyor?
		git add .
		Staging den locala tasimak icin hagi command gerekiyor
		git commit -m "new commit/updates"
		rmote a gondermek icin ne yapmak gerekiyor?
		git push
		Son durum yoklamasi veya ne oldu ne bitti diye hangi command i kullaniyoruz?
		git status
		
		***Eger remote ta degisiklik olmussa ve bilmiyorsak remote repositorydeki degisiklikleri getirmek icin 
		git fetch
		
		Kodlarimizi birlestirmek icin iki yol var biri
		Eger hic hata yoksa dogrudan kodlari cekebilirsiniz;
		git pull => hatasizken run eder
		
		Eger kodlarda cakisma ihtimali varsa yani conflict varsa o durumda ben;
		git merge kullanmaliyim		
		
		C:\Users\sam\eclipse-workspace\git_proje_turkce>git merge		
		Auto-merging src/firstpackage/FirstClass.java
		
		CONFLICT (content): Merge conflict in src/firstpackage/FirstClass.java
		Automatic merge failed; fix conflicts and then commit the result.
		
		Remote repodan gelen degisikliklerinizle local'daki degigisiklikleriniz arasinda conflict olustu
		Eger commit history gormek isterseniz;
		git log => tum commit historysini gosterir
					git log'tan sonra kilitlenince cikmak icin wq yazabiliriz.
					git log'tan sonra gelen ekrandan uniq'lerinden bir parca alip
					git show 5b18fbe9b gibi yazarak yapilan tum degisiklikleri gorebililiriz.
		
				 */
		
		// git status  ==>> en son ne oldugunu gormek icin kullanilir
			// cd dosyaPath`i ==>> calisacagimiz projeji powershell de acar
			// ls ==>> liste halinde hangi dosyalarin oldugunu gormek icin
			// git config --global user.email MailAdresi ==>> git hesabinin userNAmesini giriyoruz
			// git config --global user.name kullaniciAdi
			// git config --global color.ui true ==>>  commit lerinizi renkli olarak size veriyor
			// git init ==>> Initialized
			// git add src/firstpackage/FirstClass.java  ==>> bir dosya eklemek icin
			// git add .   ==>> tum dosyalari eklemek icin
			// github da update icin 3sey yapilir:
			// 1- git add .
			// 2- git commit -m "new uptade"
			// 3- git push

		
		

	}

}
