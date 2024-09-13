package org.skyer.order.infra.feign.impl;

import org.skyer.boot.platform.lov.dto.LovDTO;
import org.skyer.boot.platform.lov.dto.LovValueDTO;
import org.skyer.order.infra.feign.LovManageRemoteService;
import org.skyer.order.infra.feign.entity.lov.header.in.LovHeaderDto;
import org.skyer.order.infra.feign.entity.lov.header.in.LovValueDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yuelinsoft
 */
@Component
public class LovManageRemoteServiceImpl implements LovManageRemoteService {
    @Override
    public ResponseEntity<LovDTO> queryHeaderByCode(Long tenantId, String lovCode) {
        return null;
    }

    @Override
    public ResponseEntity<LovDTO> addLovHeader(Long tenantId, LovHeaderDto lovHeader) {
        return null;
    }

    @Override
    public ResponseEntity<LovValueDTO> addLovValues(Long tenantId, LovValueDto lovValue) {
        return null;
    }

    @Override
    public ResponseEntity<LovDTO> updateLovHeadersByPrimaryKey(Long tenantId, LovDTO lovHeader) {
        return null;
    }

    @Override
    public ResponseEntity<List<LovValueDto>> listValuesByLovId(Long tenantId, Long lovId, String value, String meaning) {
        return null;
    }

    @Override
    public ResponseEntity<LovValueDTO> updateLovValuesByPrimaryKey(Long tenantId, LovValueDto lovValue) {
        return null;
    }

    @Override
    public ResponseEntity batchDeleteLovHeadersByPrimaryKey(Long tenantId, List<LovDTO> lovHeaders) {
        return null;
    }

    @Override
    public ResponseEntity batchDeleteLovValuesByPrimaryKey(Long tenantId, List<LovValueDto> lovValues) {
        return null;
    }
}
