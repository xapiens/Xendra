<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	<title></title>
	<meta name="generator" content="LibreOffice 6.0.7.3 (Linux)"/>
	<meta name="created" content="00:00:00"/>
	<meta name="changed" content="2023-03-17T19:28:57.662097008"/>
	<meta name="created" content="00:00:00">
	<style type="text/css">
		h2.cjk { font-family: "Noto Sans CJK SC" }
		h2.ctl { font-family: "FreeSans" }
		pre.cjk { font-family: "DejaVu Sans Mono", monospace }
		h3.cjk { font-family: "Noto Sans CJK SC" }
		h3.ctl { font-family: "FreeSans" }
		tt.cjk { font-family: "DejaVu Sans Mono", monospace }
	</style>
</head>
<body lang="es-PE" dir="ltr">
<h1>Plugin para Editar Formatos 
</h1>
<p>El Plugin para editar formatos utiliza template MVEL, el mismo
utilizado por Drools para su motor de reglas. A continuacion una
explicacion breve de como usar MVEL.</p>
<h1>MVEL 2.0 Basic Templating</h1>
<p>MVEL Templates are compromised of <em>orb-tags</em> inside a
plaintext document. Orb-tags denote dynamic elements of the template
which the engine will evaluate at runtime.</p>
<h2 class="western"><a name="MVEL2.0BasicTemplating-ASimpleTemplate"></a>
A Simple Template</h2>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">Hello, @{person.getSex() == 'F' ? 'Ms.' : 'Mr.'} @{person.name}</span>

<span style="display: inline-block; border: none; padding: 0in">This e-mail is to thank you for your interest in MVEL Templates 2.0.</span></pre><p>
This template shows a simple template with a simple embedded
expression. When evaluated the output might look something like this:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">Hello, Ms. Sarah Peterson</span>

<span style="display: inline-block; border: none; padding: 0in">This e-mail is to thank you for your interest in MVEL Templates 2.0.</span></pre><h2 class="western">
<a name="MVEL2.0BasicTemplating-Escapingthe@symbol"></a>Escaping the
@ symbol</h2>
<p>Naturally, since the @ symbol is used to denote the beginning of
an orb-tag, you may need to <em>escape</em> it, to prevent it from
being processed by the compiler. Thankfully, there is only one
situation where this is necessary: when you actually need to produce
the string '@{' as output in your template.</p>
<p>Since the compiler requires a combination of @ and { to trigger
the orb recognition, you <em>can</em> freely use @ symbols without
escaping them. For example:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">Email any questions to: foo@bar.com</span>

<span style="display: inline-block; border: none; padding: 0in">@{date}</span>
<span style="display: inline-block; border: none; padding: 0in">@include{'disclaimer.html'}</span></pre><p>
But in the case where you need an @ symbol up-against an orb-tag, you
will need to escape it by repeating it twice:</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">@{username}@@@{domain}</span></pre><p>
That's two @'s to escape one symbol, and the third @ being the
beginning of the tag. If this looks too messy, you can always use the
alternate approach of using an expression tag, like this:</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">@{username}@{'@'}@{domain}</span></pre><h1>
MVEL 2.0 Orb Tags</h1>
<p style="margin-bottom: 0in"><br/>

</p>
<p>This page contains a list of all <em>orb-tags</em> available
out-of-the-box in the MVEL 2.0 templating engine.</p>
<h2 class="western"><a name="MVEL2.0OrbTags-@{}ExpressionOrb"></a><b>@{}</b>
<em>Expression Orb</em></h2>
<p>The expression orb is the most rudimentary form of orb-tag. It
contains a value expression which will be evaluated to a string, and
appended to the output template. For example:</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">Hello, my name is @{person.name}</span></pre><h2 class="western">
<a name="MVEL2.0OrbTags-@code{}SilentCodeTag"></a><b>@code{}</b>
<em>Silent Code Tag</em></h2>
<p>The silent code tag allows you to execute MVEL expression code in
your template. It does not return a value and does not affect the
formatting of the template in any way.</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@code{age = 23; name = 'John Doe'}</span>
<span style="display: inline-block; border: none; padding: 0in">@{name} is @{age} years old.</span></pre><p>
This template will evaluate to: <em>John Doe is 23 years old</em>.</p>
<h2 class="western"><a name="MVEL2.0OrbTags-@if{}@else{}ControlFlowTags"></a>
<b>@if{}-@else{}</b> <em>Control Flow Tags</em></h2>
<p>The <b>@if{}</b> and <b>@else{}</b> tags provide full if-then-else
functionality in MVEL Templates. For example:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@if{foo != bar}</span>
<span style="display: inline-block; border: none; padding: 0in">   Foo not a bar!</span>
<span style="display: inline-block; border: none; padding: 0in">@else{bar != cat}</span>
<span style="display: inline-block; border: none; padding: 0in">   Bar is not a cat!</span>
<span style="display: inline-block; border: none; padding: 0in">@else{}</span>
<span style="display: inline-block; border: none; padding: 0in">   Foo may be a Bar or a Cat!</span>
<span style="display: inline-block; border: none; padding: 0in">@end{}</span></pre>
<table cellpadding="2" cellspacing="2">
	<col width="24">
	<col width="0">
	<tr>
		<td valign="top" style="border: none; padding: 0in">
			<p><img src="readme_md_64e0535791b5d3b3.gif" name="Image2" align="absmiddle" width="16" height="16" border="0"/>

						</p>
		</td>
		<td style="border: none; padding: 0in">
			<p><b>Termination of blocks</b></p>
			<p>All blocks in MVEL Templates <em>must</em> be terminated with
			an @end{} orb, except in cases of an if-then-else structure, where
			@else{} tags denote the termination of the previous control
			statement.</p>
		</td>
	</tr>
</table>
<h2 class="western"><a name="MVEL2.0OrbTags-@foreach{}Foreachiteration"></a>
<b>@foreach{}</b> <em>Foreach iteration</em></h2>
<p>The foreach tag allows you to iterate either collections or arrays
in your template. Note: that the syntax for foreach has changed in
MVEL Templates 2.0 to standardize the foreach notation with that of
the MVEL language itself.</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@foreach{item : products} </span>
<span style="display: inline-block; border: none; padding: 0in"> - @{item.serialNumber}</span>
<span style="display: inline-block; border: none; padding: 0in">@end{}</span></pre><p>
MVEL 2.0 <em>requires</em> you specify an iteration variable. While
MVEL 1.2 assumed the name <em>item</em> if you did not specify an
alias, this has been dropped due to some complaints about that
default action.</p>
<h3 class="western"><a name="MVEL2.0OrbTags-Multiiteration"></a>Multi-iteration</h3>
<p>You can iterate more than one collection in a single foreach loop
at one time by comma-separating the iterations:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@foreach{var1 : set1, var2 : set2}</span>
<span style="display: inline-block; border: none; padding: 0in">  @{var1}-@{var2}</span>
<span style="display: inline-block; border: none; padding: 0in">@end{}</span></pre><h3 class="western">
<a name="MVEL2.0OrbTags-Delimiting"></a>Delimiting</h3>
<p>You can automatically add a text delimiter to an iteration by
specifying the iterator in <b>@end{}</b> tag.</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">@foreach{item : people}@{item.name}@end{', '}</span></pre><p>
This would return something like: <em>John, Mary, Joseph</em>.</p>
<h2 class="western"><a name="MVEL2.0OrbTags-@include{}IncludeTemplateFile"></a>
<b>@include{}</b> <em>Include Template File</em></h2>
<p>You may include a template file into an MVEL template using this
tag.</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@include{'header.mv'}</span>

<span style="display: inline-block; border: none; padding: 0in">This is a test template.</span></pre><p>
You may also execute an MVEL expression inside an include tag by
adding a semicolon after the template name:</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">@include{'header.mv'; title='Foo Title'}</span></pre><h2 class="western">
<a name="MVEL2.0OrbTags-@includeNamed{}IncludeaNamedTemplate"></a><b>@includeNamed{}</b>
<em>Include a Named Template</em></h2>
<p>Named templates are templates that have been precompiled and
passed to the runtime via a TemplateRegistry, or templates that have
been declared within the template itself. You simply include 
</p>
<p>You may also execute MVEL code in an @includeNamed{} tag, just as
with the @include{} tag.</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@includeNamed{'fooTemplate'}</span>
<span style="display: inline-block; border: none; padding: 0in">@includeNamed{'footerTemplate', showSomething=true}</span></pre><h2 class="western">
<a name="MVEL2.0OrbTags-@declare{}DeclareaTemplate"></a><b>@declare{}</b>
<em>Declare a Template</em></h2>
<p>In addition to including external templates from external files,
and passing them in programmatically, you can declare a template from
within a template. Which allows you to do things like this:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@declare{'personTemplate'}</span>
<span style="display: inline-block; border: none; padding: 0in"> Name: @{name}</span>
<span style="display: inline-block; border: none; padding: 0in"> Age:  @{age}</span>
<span style="display: inline-block; border: none; padding: 0in">@end{}</span>

<span style="display: inline-block; border: none; padding: 0in">@includeNamed{'personTemplate'; name='John Doe'; age=22}</span></pre><h2 class="western">
<a name="MVEL2.0OrbTags-@comment{}Commenttag"></a><b>@comment{}</b>
<em>Comment tag</em></h2>
<p>The comment tag allows you add an invisible comment to the
template. For example:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">@comment{</span>
<span style="display: inline-block; border: none; padding: 0in">  This is a comment</span>
<span style="display: inline-block; border: none; padding: 0in">}</span>
<span style="display: inline-block; border: none; padding: 0in">Hello: @{name}!</span></pre><h1>
MVEL 2.0 Template Integration</h1>
<p>Usar plantillas MVEL es facil y sencillo. Como expresiones
regulares MVEL, estos pueden ser interpretados o ser pre compilados y
ser reusados para una evaluacion rapida.</p>
<h2 class="western"><tt class="western"><b>org.mvel.templates.TemplateRuntime</b></tt>
Class</h2>
<p>La clase <tt class="western"><b>TemplateRuntime</b></tt> es el
centro del motor de plantillas. Puede pasar una plantilla para ser
evaluada al motor de plantillas via el metodo eval() 
</p>
<p>En general, el motor de plantillas sigue las mismas reglas para
context y enlace(binding) con variables con una sobrecarga de metodos
en <tt class="western"><b>eval()</b></tt>.</p>
<p>Aqui un simple ejemplo de parsear una plantilla
interpretativamente:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">String template = &quot;Hello, my name is @{name.toUpperCase()}&quot;);</span>
<span style="display: inline-block; border: none; padding: 0in">Map vars = new HashMap();</span>
<span style="display: inline-block; border: none; padding: 0in">vars.put(&quot;name&quot;, &quot;Michael&quot;);</span>

<span style="display: inline-block; border: none; padding: 0in">String output = (String) TemplateRuntime.eval(template, vars);</span></pre><p>
Al final de la ejecucion, la “salida” deberia contener la cadena:
</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">Hello, my name is MICHAEL</span></pre><h2 class="western">
<tt class="western"><b>org.mvel.templates.TemplateCompiler</b></tt>
Class</h2>
<p>La clase <tt class="western"><b>TemplateCompiler</b></tt> permite
pre compilar las plantillas.</p>
<p>Cuando compila una plantilla, un compacto, reusable arbol de
evaluacion es producido que puede ser usado para evaluar rapidamente
una plantilla , su uso es sencillo:</p>
<pre class="western"><span style="display: inline-block; border: none; padding: 0in">String template = &quot;1 + 1 = @{1+1}&quot;;</span>

<span style="display: inline-block; border: none; padding: 0in">// compile the template</span>
<span style="display: inline-block; border: none; padding: 0in">CompiledTemplate compiled = TemplateCompiler.compileTemplate(template);</span>

<span style="display: inline-block; border: none; padding: 0in">// execute the template</span>
<span style="display: inline-block; border: none; padding: 0in">String output = (String) TemplateRuntime.execute(compiled);</span></pre><p>
Al final de la ejecucion, la “salida” deberia contener la cadena:</p>
<pre class="western" style="margin-bottom: 0.2in"><span style="display: inline-block; border: none; padding: 0in">1 + 1 = 2</span></pre>
</body>
</html>