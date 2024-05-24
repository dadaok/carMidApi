package lotte.carmidapi.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class AsIsPropertyNamingStrategy extends PropertyNamingStrategy {
    @Override
    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
        return field.getName(); // 필드 이름을 그대로 반환
    }

    @Override
    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return translate(defaultName); // 기본 이름을 그대로 사용
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return translate(defaultName); // 기본 이름을 그대로 사용
    }

    private String translate(String defaultName) {
        // 필요한 경우 이름 변환 로직 추가
        // 여기서는 이름을 그대로 사용하므로 변환 로직 없음
        return defaultName;
    }
}