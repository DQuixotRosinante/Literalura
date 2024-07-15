package com.literalura.Literalura.configuration.iConfig;

public interface IConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);

}
