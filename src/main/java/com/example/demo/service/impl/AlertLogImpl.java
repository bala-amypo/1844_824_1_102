@Service
public class AlertLogServiceImpl implements AlertLogService {

    @Autowired
    private AlertLogRepository repo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ServiceRequestRepository requestRepo;

    @Override
    public AlertLog createAlert(String message, Long userId, Long requestId) {

        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        ServiceRequest req = requestRepo.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        AlertLog alert = new AlertLog();
        alert.setMessage(message);
        alert.setTimestamp(LocalDateTime.now());
        alert.setUser(user);
        alert.setServiceRequest(req);

        return repo.save(alert);
    }

    @Override
    public List<AlertLog> getAlertsByUser(Long userId) {
        return repo.findByUserUserId(userId);
    }

    @Override
    public List<AlertLog> getAlertsByRequest(Long requestId) {
        return repo.findByServiceRequestRequestId(requestId);
    }
}
