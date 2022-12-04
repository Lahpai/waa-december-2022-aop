package miu.edu.day5springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.ActivityLog;
import miu.edu.day5springdata.repository.ActivityLogRepo;
import miu.edu.day5springdata.service.ActivityLogService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityLogServiceImpl implements ActivityLogService {

    private final ActivityLogRepo activityLogRepo;

    public void save(ActivityLog log) {
        activityLogRepo.save(log);
    }
}
