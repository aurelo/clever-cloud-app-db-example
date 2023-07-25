package com.kanezi.clevercloudappdbexample;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/avatar")
@Value
@Log4j2
@NonFinal
public class AvatarController {

    AvatarRepository avatarRepository;

    @GetMapping
    List<Avatar> showAvatars() {
        return avatarRepository.findAll();
    }


    @PostConstruct
    @Transactional
    public void createDummyAvatars() {
        Avatar elephant = avatarRepository.findById("elephant")
                                          .orElse(avatarRepository.save(new Avatar("elephant", "elephant.png")));
        log.info("avatar: elephant {}", elephant);

        Avatar donkey = avatarRepository.findById("donkey")
                                        .orElse(avatarRepository.save(new Avatar("donkey", "donkey.png")));
        log.info("avatar: donkey {}", donkey);
    }
}
