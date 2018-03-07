package br.com.srm.util;

import br.com.srm.dto.ResponseDTO;

public class ResponseFactory {

    public static ResponseDTO newInstance( final String message ) {
        return new ResponseDTO(message);
    }
}
