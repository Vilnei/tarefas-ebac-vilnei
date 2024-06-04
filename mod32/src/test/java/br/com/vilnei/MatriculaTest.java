package br.com.vilnei;

import br.com.vilnei.dao.IMatriculaDao;
import br.com.vilnei.dao.MatriculaDao;
import br.com.vilnei.domain.Matricula;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

        private IMatriculaDao matriculaDao;

        public MatriculaTest() {
            matriculaDao = new MatriculaDao();
        }

        @Test
        public void cadastrar() {
            Matricula matricula = new Matricula();
            matricula.setCodigo("A2");
            //matricula.setDataMatricula();
            matricula.setStatus("Aberto");
            matricula.setValor(10d);
            matricula = matriculaDao.cadastrar(matricula);

            assertNotNull(matricula);
            assertNotNull(matricula.getId());
        }
}
