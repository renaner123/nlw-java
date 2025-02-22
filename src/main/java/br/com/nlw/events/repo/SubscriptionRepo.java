package br.com.nlw.events.repo;

import br.com.nlw.events.dto.SubscriptionRankingItem;
import br.com.nlw.events.model.Event;
import br.com.nlw.events.model.Subscription;
import br.com.nlw.events.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriptionRepo extends CrudRepository<Subscription, Integer> {

    public Subscription findByEventAndSubscriber(Event event, User user);

    @Query(value = "SELECT COUNT(subscription_number) AS quantidade, indication_user_id, user_name " +
            " FROM tbl_subscription " +
            " JOIN tbl_user ON user_id = indication_user_id " +
            " WHERE event_id = :eventId " +
            " GROUP BY indication_user_id " +
            " ORDER BY quantidade DESC ", nativeQuery = true)
    public List<SubscriptionRankingItem> generateRanking(@Param("eventId") Integer eventId);
}
