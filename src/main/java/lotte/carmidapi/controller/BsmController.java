package lotte.carmidapi.controller;

import lotte.carmidapi.common.dto.ResponseDTO;
import lotte.carmidapi.model.request.BsmRequest;
import lotte.carmidapi.service.BsmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class BsmController {

    private final BsmService bsmService;

    @PostMapping("/bsmSend")
    public ResponseEntity<ResponseDTO> bsmSend(@RequestBody BsmRequest bsmRequest){
        return bsmService.bsmSend(bsmRequest);
    }
}
