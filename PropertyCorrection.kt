package com.example.blissos

import java.io.BufferedReader
import java.io.InputStreamReader

object PropertyCorrection {

    fun fixWithRootAccess() {
        Runtime.getRuntime().exec("su -c 'dumpsys deviceidle whitelist -com.google.android.gms'")
    }

    fun optimizeGMS() {
        fixWithRootAccess()
    }
}
