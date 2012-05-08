package phpjava;

import com.caucho.quercus.servlet.QuercusServlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyQuercusServlet extends QuercusServlet {

  public MyQuercusServlet() {
  }

  @Override
  public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try {
      super.service(req, resp);
    } catch (Throwable e) {
      resp.reset();
      e.printStackTrace(resp.getWriter());
      resp.setContentType("text/plain");
      resp.setStatus(503);
    }
  }
}
