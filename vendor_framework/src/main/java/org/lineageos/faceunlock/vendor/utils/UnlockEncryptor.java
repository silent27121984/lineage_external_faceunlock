package org.lineageos.faceunlock.vendor.utils;

public interface UnlockEncryptor {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
