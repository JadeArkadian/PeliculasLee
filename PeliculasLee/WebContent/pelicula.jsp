<%@include file="WEB-INF/includes/header.jsp" %>

        <!-- Main -->
        <div id="main">
        <div class="innerMovie">  
            <div class="thumbnails">
                    
                <div class="leftPane">
                    <h2>Datos de la pelicula</h2>
                    <table>
                        <tr> 
                            <td>Titulo:</td> 
                            <td>Fantasma en la concha</td> 
                        </tr>
                        <tr>
                            <td>Año:</td>
                            <td>2020</td>
                        </tr>
                        <tr>
                            <td>Director:</td>
                            <td>Salchichen Von Salchichon</td>
                        </tr>
                        <tr>
                            <td>Reparto:</td>
                            <td>Viuda negra, Tecnociclope, Yakuza chungo, Chappie</td>
                        </tr>
                        <tr>
                            <td>Generos:</td>
                            <td>Accion, Aventura</td>
                        </tr>
                        <tr>
                            <td>Sinoposis:</td>
                            <td>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.</td>
                        </tr>
                    </table>
                    
                    <h2>Comentarios</h2>
                    
                    <div class="comentario">
                        <p><strong>Fulanito dijo:</strong></p>
                        <p>La mejor peli de todos lo tiempos, la recomiendo! Lo mejor es chappie al final comiendose un donut...conmovedor!!</p>
                    </div>
                    
                    <div class="comentario">
                        <p><strong>Fulanito2 dijo:</strong></p>
                        <p>Vendo bueno bonito barato! Kitisoma! Paga! Pagame! Vendo moto! 100 €. Barata barata! Solo 8.000.000km! Como nueva! Poca gasolina gasta e ir mu rapido! Vamos amigu. compra compra, tu compra moto que yo haser buen presio si.</p>
                    </div>
                    
                    <div class="comentario">
                        <p><strong>Senior Lorem Ipsum dijo:</strong></p>
                        <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.</p>
                    </div>
                    
                    <h2>Escribir un comentario</h2>
                    
                    <form action="escribirComentario.do" id="escribirComentario" name="escribirComentario" method="post">
                    
                        <textarea form="escribirComentario" class="myCommentBox" ></textarea>
                    
                        <input class="special" type="submit" value="Enviar">
                    </form>
                    
                    

                </div>
                
                <div class="rightPane">
                    <a href="https://youtu.be/s6zR2T9vn2c" class="image fit"><img src="images/movies/ghost_in_the_shell.jpg" alt="ghost_in_the_shell" /></a>
                    <table>
                        <tr>
                            <td class="nota">Nota:<p>5/5</p></td>
                            <td>
                                <div class="pollBars">
                                    1<span class="t2" style="width: 10%">69</span>
                                    2<span class="t2" style="width: 20%">100</span>
                                    3<span class="t2" style="width: 70%">200</span>
                                    4<span class="t2" style="width: 90%">666</span>
                                    5<span class="t2" style="width: 100%">Over 9000!!</span>
                                </div>
                            </td>
                        </tr>
                    </table>        
                </div>
            </div>
        </div>
	</div>
    
    
<%@include file="WEB-INF/includes/footer.jsp" %>

