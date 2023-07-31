package StructuralDP.FacadeDP;

public class CustomEncryptor {

    public static void main(String[] args) {

        // !!! kötü dizayn orneği
        String text = " Content";

        AESEnc aesEnc = new AESEnc();
        aesEnc.encrypt(text);

        MD5Enc md5Enc = new MD5Enc();
        md5Enc.encrypt(text,"KEY");

        SHAEnc shaEnc = new SHAEnc();
        shaEnc.encrypt(text,"KEY",true);


        // !!! iyi dizayn örneği
        System.out.println("***********************************");
        EncFacade encFacade = new EncFacade();
        encFacade.encrypt(text, EncFacade.EncType.SHA);

    }
}
