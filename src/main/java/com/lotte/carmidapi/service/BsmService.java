package com.lotte.carmidapi.service;

import com.lotte.carmidapi.common.dto.ResponseDTO;
import com.lotte.carmidapi.model.request.BsmRequest;
import org.springframework.http.ResponseEntity;

public interface BsmService {
    public ResponseEntity<ResponseDTO> bsmSend(BsmRequest bsmRequest);
}
