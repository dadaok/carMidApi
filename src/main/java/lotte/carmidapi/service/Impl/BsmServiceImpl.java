package lotte.carmidapi.service.Impl;

import lotte.carmidapi.common.dto.ResponseDTO;
import lotte.carmidapi.model.request.BsmRequest;
import lotte.carmidapi.service.BsmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BsmServiceImpl implements BsmService {

    private final KafkaTemplate<String, BsmRequest> kafkaTemplate;

    @Override
    public ResponseEntity<ResponseDTO> bsmSend(BsmRequest bsmRequest){

        kafkaTemplate.send("bsm",bsmRequest);

        return ResponseEntity.ok(ResponseDTO.builder()
                .msg("SUCCESS!!")
                .build());
    }
}
