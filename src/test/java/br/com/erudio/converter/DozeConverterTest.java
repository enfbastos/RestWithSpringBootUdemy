package br.com.erudio.converter;

import br.com.erudio.converter.mocks.MockPerson;
import br.com.erudio.data.vo.PersonVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DozeConverterTest {

    MockPerson inputObject;

    @Before
    public void setUp() {
        inputObject = new MockPerson();
    }

    @Test
    public void parseEntityToVOTest() {
        PersonVO output = DozerConverter.parseObject(inputObject.mockEntity(), PersonVO.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("First Name Test0", output.getFirstName());
        Assert.assertEquals("Last Name Test0", output.getLastName());
    }
}
