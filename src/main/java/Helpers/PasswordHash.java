package Helpers;

/**
 * Secure password hash and sult generation
 * @author Karlen Mkrtchyan
 *
 */
public class PasswordHash {
	
	public static String createHash(String txt){
		String hashed = txt;
		for(int i = 0 ;i<100;i++){
			if(i% 4 == 0){
				hashed = PasswordHash.md5(hashed);
			}else{
				hashed = PasswordHash.sha1(hashed);
			}
		}
		hashed = hashed.toUpperCase();
		return hashed;
	}

    private static String getHash(String txt, String hashType) {
        try {
                    java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
                    byte[] array = md.digest(txt.getBytes());
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < array.length; ++i) {
                        sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
                 }
                    return sb.toString();
            } catch (java.security.NoSuchAlgorithmException e) {
                //error action
            }
            return null;
    }

    private static String md5(String txt) {
        return PasswordHash.getHash(txt, "MD5");
    }

    private static String sha1(String txt) {
        return PasswordHash.getHash(txt, "SHA1");
    }
}