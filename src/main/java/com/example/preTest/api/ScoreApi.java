package com.example.preTest.api;

import com.example.preTest.common.constants.MessageConstants;
import com.example.preTest.dto.Result;
import com.example.preTest.dto.ScoreDto;
import com.example.preTest.service.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pretest/score/")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class ScoreApi {
    private final ScoreService scoreService;

    @PostMapping(value = "save")
    private @ResponseBody ResponseEntity<Result> save(@RequestBody ScoreDto scoreDto){
        scoreService.save(scoreDto);
        return ResponseEntity.ok(Result.success(MessageConstants.successMessage));
    }

    @PostMapping(value = "update")
    private @ResponseBody ResponseEntity<Result> update(@RequestBody ScoreDto scoreDto){
        scoreService.update(scoreDto);
        return ResponseEntity.ok(Result.success(MessageConstants.successMessage));
    }

    @GetMapping(value = "list")
    public @ResponseBody ResponseEntity<Result> list(){
        List<ScoreDto> scoreDtoList = scoreService.list();
        return ResponseEntity.ok(Result.success(MessageConstants.successMessage, scoreDtoList));
    }

    @GetMapping(value = "{id}")
    public @ResponseBody ResponseEntity<Result> getScoreById(@PathVariable Integer id){
        ScoreDto scoreDto = scoreService.getScoreById(id);

        if (scoreDto == null)
            ResponseEntity.ok(Result.error(MessageConstants.successMessage));

        return ResponseEntity.ok(Result.success(MessageConstants.successMessage, scoreDto));
    }

    @DeleteMapping(value = "delete/{id}")
    public @ResponseBody ResponseEntity<Result> delete(@PathVariable Integer id){
        Boolean status = scoreService.delete(id);

        if (status)
            ResponseEntity.ok(Result.error(MessageConstants.successMessage));

        return ResponseEntity.ok(Result.success(MessageConstants.successMessage));
    }
}
