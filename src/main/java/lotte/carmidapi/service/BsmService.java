package lotte.carmidapi.service;

import lotte.carmidapi.common.dto.ResponseDTO;
import lotte.carmidapi.model.request.BsmRequest;
import org.springframework.http.ResponseEntity;

public interface BsmService {
    public ResponseEntity<ResponseDTO> bsmSend(BsmRequest bsmRequest);
}
