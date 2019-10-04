package rowe.graphql.graphqlserver.partners;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GetPartnersResolverTest {

    private GetPartnersResolver resolver;
    private PartnerRepository repo;

    @Before
    public void setup() {
        repo = mock(PartnerRepository.class);
        resolver = new GetPartnersResolver(repo);
    }

    @Test
    public void shouldReturnTheIterableReturnedByFindAll() {
        List<Partner> results = Arrays.asList(new Partner());
        when(repo.findAll()).thenReturn(results);

        assertThat(resolver.getPartners()).isEqualTo(results);
    }
}