package tmax.roger.wstest.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Chat {
    @Id
    private Long id;


}
