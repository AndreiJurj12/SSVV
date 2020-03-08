package repository;

import domain.*;
import validation.*;

public class NotaRepository extends AbstractCRUDRepository<Pair<String, String>, Grade> {
    public NotaRepository(Validator<Grade> validator) {
        super(validator);
    }
}
