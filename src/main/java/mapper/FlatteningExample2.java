package mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

public class FlatteningExample2 {
    public static void main(String... args) throws Exception {
        Person person = new Person();
        Address address = new Address();
        address.setStreet("1234 Main street");
        address.setCity("San Francisco");
        person.setAddress(address);

        // Option 1
        ModelMapper modelMapper = new ModelMapper();
        PropertyMap<Person, PersonDTO> personMap = new PropertyMap<Person, PersonDTO>() {
            protected void configure() {
                map().setStreet(source.getAddress().getStreet());
                map().setCity(source.getAddress().getCity()) ;
                //map(source.getAddress().city, destination.city);
            }
        };

        modelMapper.addMappings(personMap);
        PersonDTO dto = modelMapper.map(person, PersonDTO.class);

        System.out.println("Street = " + dto.getStreet());
        System.out.println("City = " + dto.getCity());



        // Option 2
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        dto = modelMapper.map(person, PersonDTO.class);


    }
}