<?php
$name = 'Денис';
$profession = 'Developer';
$city = 'Moscow';
$email = 'denis@mail.ru';
$phone = '88005553535';
$skills = [
    [
        'name' => 'Фотошоп',
        'percent' => 90,
    ],
    [
        'name' => 'Иллюстратор',
        'percent' => 30,
    ],
    [
        'name' => 'Медиа',
        'percent' => 40,
    ],
];
$expirience = [
    [
        'position' => 'Разработчик интерфейсов системы автоматизации робосклада в Яндекс.Лавка',
        'job_start' => '10.02.2021',
        'job_finish' => 'По сей день',
        'description' => 'разработка интерфейса настройки топологии склада; визуализация аналитических отчётов ',
    ],
    [
        'position' => 'Технический менеджер проектов',
        'job_start' => '01.02.2020',
        'job_finish' => '11.06.2022',
        'description' => 'Обработка технических заказов от руководителей разработки, анализ пользовательской метрики (NPS/CSI)',
    ],
    [
        'position' => 'Разработчик интерфейсов в Яндекс Бизнес',
        'job_start' => '02.05.2018',
        'job_finish' => '30.01.2020',
        'description' => 'работа с базами данных и API; поддержка и развивитие инфраструктуры;',
    ],
    [
        'position' => 'Разработчик интерфейсов облачной инфраструктуры',
        'job_start' => '5.09.2013',
        'job_finish' => '5.02.2017',
        'description' => 'Развитие библиотеки компонентов для более тесной интеграции с другими системами инфраструктурного облака',
    ],
];
?>
<!DOCTYPE html>
<html>
<head>
  <title>Мое резюме</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Jost:wght@300&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style>
    html,
    body,
    h1,
    h2,
    h3,
    h4,
    h5,
    h6 {
      font-family: 'Jost', sans-serif;
    }
  </style>
</head>
<body class="w3-light-grey">
  <!-- Page Container -->
  <div class="w3-content w3-margin-top" style="max-width:1400px;">
    <!-- The Grid -->
    <div class="w3-row-padding">
      <!-- Left Column -->
      <div class="w3-third">
        <div class="w3-white w3-text-grey w3-card-4">
          <div class="w3-display-container">
            <img src="https://imgfon.ru/Images/Details_img_880px/Animals/glaza-belyy_fon-kotik-morda-polosatyy.webp"
              style="width:100%" alt="Avatar">
            <div class="w3-display-bottomleft w3-container w3-text-black">
              <h2><?php echo $name; ?></h2>
            </div>
          </div>
          <div class="w3-container">
            <p><i class="fa fa-briefcase fa-fw w3-margin-right w3-large w3-text-teal"></i><?= $profession; ?></p>
            <p><i class="fa fa-home fa-fw w3-margin-right w3-large w3-text-teal"></i><?= $city; ?></p>
            <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i><?= $email; ?></p>
            <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i><?= $phone; ?></p>

            <hr>

            <p class="w3-large"><b><i class="fa fa-asterisk fa-fw w3-margin-right w3-text-teal"></i>Навыки</b></p>
            <?php for ($i = 0; $i < count($skills); $i++): 
            $percent = $skills[$i]['percent'];
            ?>
              <p><?php echo $skills[$i]['name']; ?></p>
              <div class="w3-light-grey w3-round-xlarge w3-small">
                <div class="w3-container w3-center w3-round-xlarge w3-teal" style="width:<?php echo $percent; ?>%"><?php echo $percent; ?>%</div>
              </div>
            <?php endfor; ?>
            <br>

            <p class="w3-large w3-text-theme"><b><i class="fa fa-globe fa-fw w3-margin-right w3-text-teal"></i>Языки</b>
            </p>
            <p>Английский</p>
            <div class="w3-light-grey w3-round-xlarge">
              <div class="w3-round-xlarge w3-teal" style="height:24px;width:100%"></div>
            </div>
            <p>Испанский</p>
            <div class="w3-light-grey w3-round-xlarge">
              <div class="w3-round-xlarge w3-teal" style="height:24px;width:55%"></div>
            </div>
            <p>Немецкий</p>
            <div class="w3-light-grey w3-round-xlarge">
              <div class="w3-round-xlarge w3-teal" style="height:24px;width:25%"></div>
            </div>
            <br>
          </div>
        </div>
        <br>
        <!-- End Left Column -->
      </div>
      <!-- Right Column -->
      <div class="w3-twothird">
        <div class="w3-container w3-card w3-white w3-margin-bottom">
          <h2 class="w3-text-grey w3-padding-16"><i
              class="fa fa-suitcase fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Опыт работы</h2>
          <?php for ($i = 0; $i < count($expirience); $i++): ?>
          <div class="w3-container">
            <h5 class="w3-opacity"><b><?php echo $expirience[$i]['position']; ?></b></h5>
            <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i><?php echo $expirience[$i]['job_start']; ?> - <span
                class="w3-tag w3-teal w3-round"><?php echo $expirience[$i]['job_finish']; ?></span></h6>
            <p><?php echo $expirience[$i]['description']; ?></p>
            <hr>
          </div>
          <?php endfor; ?>

        <div class="w3-container w3-card w3-white">
          <h2 class="w3-text-grey w3-padding-16"><i
              class="fa fa-certificate fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Образование</h2>
          <div class="w3-container">
            <h5 class="w3-opacity"><b>Geekbrains</b></h5>
            <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>по сей день</h6>
            <p>Курс "Разработчик"</p>
            <hr>
          </div>
          <div class="w3-container">
            <h5 class="w3-opacity"><b>Финансовый университет при Правительстве Российской Федерации</b></h5>
            <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>2012 - 2017</h6>
            <p>финансовая аналитика</p>
            <hr>
          </div>
        </div>
        <!-- End Right Column -->
      </div>
      <!-- End Grid -->
    </div>
    <!-- End Page Container -->
  </div>
  <!-- Footer -->
  <footer class="w3-container w3-teal w3-center w3-margin-top">
    <p>Find me on social media.</p>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
    <!-- End footer -->
  </footer>
</body>
</html>
