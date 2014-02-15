package a9_8;
public class tww {

	public static void encode(byte[] in, byte[] out, int password) {
		
		int len = in.length;

		int seed = password ^ 0x90654604;
		for (int i = 0; i < len; ++i) {
			int m = in[i] ^ seed;
			byte a = (byte) ((in[i] ^ seed) >>> 2);
			byte b = (byte) (((((int) in[i]) << 18) ^ seed) >>> (18 - 6));
			a &= 0x3f;
			b &= 0xc0;
			out[i] = (byte) (a | b);
			seed = (((seed << 7) ^ seed ^ out[i]) + 1792013);
			seed = seed;
		}
	}

	public static void decode(byte[] in, byte[] out, int password) {
		int len = in.length;

		int seed = password ^ 0x90654604;
		for (int i = 0; i < len; ++i) {
			byte a = (byte) (in[i] & 0x3f);
			byte b = (byte) (in[i] & 0xc0);
			a = (byte) (((a << 2) ^ seed) & 0xfc);
			b = (byte) ((((((int) b) << (18 - 6)) ^ seed) >> 18) & 0x03);
			out[i] = (byte) (a | b);
			seed = (((seed << 7) ^ seed ^ in[i]) + 1792013);
		}
	}

	public static void main(String[] args) throws Exception {
		int password = 0xab6d1028;
		byte[] buf1 = { -2, 14, 37, -56, -67, 109, 19, 57, -38, 57, -32, -36,
				-49, -69, 115, 29, -33, 90, -107, 121, 82, -65, 93, 92, -45,
				74, 122, -91, -27, -26, 99, 43, 63, -12, -52, -110, };
		byte[] buf2 = new byte[buf1.length];
		encode(buf1, buf2, password);
		decode(buf2, buf1, password);
		System.out.println(new String(buf1, "GBK"));
	}

}
