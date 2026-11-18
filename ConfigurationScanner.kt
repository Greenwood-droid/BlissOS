package com.example.blissos

import java.io.BufferedReader
import java.io.InputStreamReader

object ConfigurationScanner {

    fun scan(): String {
        val report = StringBuilder()
        report.append("Scanning BlissOS...\n")
        report.append("GMS Issues: ${scanGMSIssues()}\n")
        return report.toString()
    }

    fun scanGMSIssues(): String {
        val process = Runtime.getRuntime().exec("su -c 'find /data/anr/ -name \"*.anr\" -mtime -1'")
        val reader = BufferedReader(InputStreamReader(process.inputStream))
        val output = reader.readText()
        reader.close()
        return if (output.isNotEmpty()) {
            "GMS ANR files found: $output"
        } else {
            "No GMS ANR files found."
        }
    }
}
