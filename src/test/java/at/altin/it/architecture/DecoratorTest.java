package at.altin.it.architecture;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * This Test makes sure that the Decorator Pattern is implemented correctly
 * Test Driven Development of the Decorator Pattern
 * use afterward actual Component and Decorator classes
 */
public class DecoratorTest {

    public interface Component {
        String operation();
    }

    public static class ConcreteComponent implements Component {
        @Override
        public String operation() {
            return "Base Operation";
        }
    }

    public interface Decorator extends Component {
    }

    public static class ConcreteDecorator implements Decorator {
        private final Component component;

        public ConcreteDecorator(Component component) {
            this.component = component;
        }

        @Override
        public String operation() {
            return component.operation() + " + Decorator Operation";
        }
    }

    @Test
    public void testBaseComponent() {
        Component component = new ConcreteComponent();
        assertEquals("Base Operation", component.operation());
    }

    @Test
    public void testDecorator() {
        Component componentMock = mock(Component.class);
        when(componentMock.operation()).thenReturn("Base Operation");

        Decorator decorator = new ConcreteDecorator(componentMock);

        assertEquals("Base Operation + Decorator Operation", decorator.operation());
        verify(componentMock).operation();
    }
}
