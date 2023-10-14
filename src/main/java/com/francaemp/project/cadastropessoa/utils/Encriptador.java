package com.francaemp.project.cadastropessoa.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptador {

    public static String encriptar(String password) {
        try {
            // Cria uma instância do MessageDigest com o algoritmo SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Converte a senha em bytes
            byte[] passwordBytes = password.getBytes();

            // Calcula o hash da senha
            byte[] passwordHash = md.digest(passwordBytes);

            // Converte o hash em uma representação de string hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : passwordHash) {
                hexString.append(String.format("%02x", b));
            }

            // Retorna o hash da senha como uma string hexadecimal
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Trata exceção se o algoritmo não for suportad
            return null;
        }
    }

}
