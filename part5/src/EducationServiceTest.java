import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EducationServiceTest {

        @Rule
        public MockitoRule mockitoRule = MockitoJUnit.rule();

        @Mock
        private StudentDataObject studentDataObject;

        @Mock
        private InstructorDataObject instructorDataObject;

        @Mock
        private ClassDataObject classDataObject;

        @InjectMocks
        private ClientBusinessObjectImpl clientBusinessObjectImpl;
}
